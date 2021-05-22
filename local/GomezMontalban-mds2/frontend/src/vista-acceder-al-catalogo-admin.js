import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-productos-admin.js';
import './vista-categorias-admin.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

class VistaAccederAlCatalogoAdmin extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; margin: var(--lumo-space-m); align-items: center; justify-content: center;" theme="spacing" id="layoutCatalogoAdmin">
 <h1 style="flex-shrink: 0; align-self: flex-start;">Catálogo </h1>
</vaadin-vertical-layout>
<vaadin-horizontal-layout style="height: 100%;">
 <vaadin-vertical-layout style="width: 20%; align-items: flex-start;">
  <vista-categorias-admin style="height: 10%; margin-bottom: var(--lumo-space-xl); padding-bottom: var(--lumo-space-xl);"></vista-categorias-admin>
  <vaadin-horizontal-layout theme="spacing" id="layoutSelect" style="align-self: center;"></vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout id="layoutProductosCatalogoAdmin" style="width: 80%;">
  <vaadin-horizontal-layout style="width: 100%; height: 100%;">
   <vista-productos-admin style="height: 100%;"></vista-productos-admin>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'vista-acceder-al-catalogo-admin';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaAccederAlCatalogoAdmin.is, VistaAccederAlCatalogoAdmin);
