import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-categoria-admin.js';

class VistaCategoriasAdmin extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%;">
 <vaadin-vertical-layout theme="spacing" style="width: 100%; margin: var(--lumo-space-m); flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
  <h4 style="flex-shrink: 0; align-self: center;">Categorías</h4>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 100%; margin: var(--lumo-space-m); flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
  <vista-categoria-admin></vista-categoria-admin>
  <vista-categoria-admin></vista-categoria-admin>
  <vista-categoria-admin></vista-categoria-admin>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-categorias-admin';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaCategoriasAdmin.is, VistaCategoriasAdmin);
