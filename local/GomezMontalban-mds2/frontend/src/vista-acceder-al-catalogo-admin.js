import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-categorias-admin.js';
import './vista-productos-admin.js';

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
 <vaadin-vertical-layout theme="spacing" style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: flex-start; align-items: center; justify-content: center; width: 100%;">
  <h1 style="width: 100%; margin: var(--lumo-space-m); align-self: center; flex-shrink: 0;">Catálogo</h1>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="flex-shrink: 0; align-self: center; justify-content: center; margin: var(--lumo-space-m); width: 100%;">
  <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; align-self: flex-start; width: 100%;">
   <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); align-self: center; flex-shrink: 0; align-items: center; justify-content: center; width: 40%;">
    <vista-categorias-admin></vista-categorias-admin>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; align-items: center; justify-content: center; width: 40%; margin: var(--lumo-space-m); align-self: center;" id="layoutProductosAdmin">
    <vista-productos-admin style="flex-shrink: 0; align-self: center; margin: var(--lumo-space-m);" id="layoutVistaProductosAdmin"></vista-productos-admin>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
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
