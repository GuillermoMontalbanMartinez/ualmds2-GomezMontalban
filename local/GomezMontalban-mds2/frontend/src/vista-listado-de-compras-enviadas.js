import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';

class VistaListadoDeComprasEnviadas extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-text-field style="align-self: center; width: 100%; height: 100%;"></vaadin-text-field>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-listado-de-compras-enviadas';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaListadoDeComprasEnviadas.is, VistaListadoDeComprasEnviadas);
