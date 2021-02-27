import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-compras-enviadas`
 *
 * VistaComprasEnviadas element.
 *
 * @customElement
 * @polymer
 */
class VistaComprasEnviadas extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
        `;
    }

    static get is() {
        return 'vista-compras-enviadas';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaComprasEnviadas.is, VistaComprasEnviadas);
