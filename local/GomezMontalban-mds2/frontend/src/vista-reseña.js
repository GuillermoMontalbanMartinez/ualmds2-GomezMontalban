import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-reseña`
 *
 * VistaReseña element.
 *
 * @customElement
 * @polymer
 */
class VistaReseña extends PolymerElement {

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
        return 'vista-reseña';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaReseña.is, VistaReseña);
