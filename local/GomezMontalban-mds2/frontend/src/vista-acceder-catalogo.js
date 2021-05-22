import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import './vista-categorias.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-productos.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaAccederCatalogo extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-vertical-layout id="layoutCatalogo">
 <h1 style="margin-left: var(--lumo-space-xl);">Catálogo</h1>
</vaadin-vertical-layout>
<vaadin-horizontal-layout theme="spacing" style="height: 100%;">
 <vaadin-vertical-layout theme="spacing" style="width: 20%;">
  <vista-categorias style="width: 100%; height: 10%; flex-shrink: 1; margin-bottom: var(--lumo-space-l); padding-bottom: var(--lumo-space-l);"></vista-categorias>
  <vaadin-horizontal-layout theme="spacing" id="selectLayout" style="align-self: center;"></vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 100%;" id="layoutProductosCatalogo">
  <vaadin-horizontal-layout theme="spacing" style="width: 100%;">
   <vista-productos style="width: 100%;"></vista-productos>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'vista-acceder-catalogo';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaAccederCatalogo.is, VistaAccederCatalogo);
